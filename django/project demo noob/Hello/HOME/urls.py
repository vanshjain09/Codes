from django.contrib import admin
from django.urls import path
from HOME import views

urlpatterns = [
    path("",views.index,name='HOME'),
    path("services",views.services,name="services"),
]