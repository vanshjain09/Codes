import requests
import json

def speak(str):
    from win32com.client import Dispatch
    speak=Dispatch("SAPI.spVoice")
    speak.speak(str)
speak("   HHello Everyone Welcome to vansh news portal")
speak("Lets begin today news")
url="https://newsapi.org/v2/top-headlines?country=in&apiKey=625b9695260e4cd6880cde87c5792e4e"
news=requests.get(url).text

news_dict=json.loads(news)
print(news_dict["articles"])
arts=news_dict['articles']
for article in arts:
    speak(article['title'])
    speak("Next news ...Listen carefully")






