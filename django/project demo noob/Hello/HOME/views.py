from django.shortcuts import render,HttpResponse

# Create your views here.
def index(request):
    #also we can add context
    return render(request, 'sample.html')
    #return HttpResponse("This is Home Page")
def services(request):
    return HttpResponse("This is Service Page")
