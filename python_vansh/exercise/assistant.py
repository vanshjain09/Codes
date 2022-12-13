import pyttsx3
import datetime
import speech_recognition as sr
import wikipedia
import webbrowser
import os
engine=pyttsx3.init('sapi5')
voices=engine.getProperty('voices')
engine.setProperty('voice', voices[0].id)
#print(voices[0].id) david voice
#print(voices[1].id)  hazel voice
def wishme():
    hour=int(datetime.datetime.now().hour)
    if hour<=24 and hour>=18:
        print("Good evening sir ! I am bruce How may i help you")
        speak("Good evening sir ! I am bruce How may i help you")
    elif hour<=18 and hour>=12:
        print("Good after noon sir !I am bruce How may i help you")
        speak("Good after noon sir !I am bruce How may i help you")
    else:
        print("Good morning sir ! I am Bruce How may i help you")
        speak("Good morning sir ! I am Bruce How may i help you")
def takeCommand():
    #it take microphone input from user and gives string output
    r=sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening.....")
        r.pause_threshold=1
        audio=r.listen(source)
    try:
        print("Recognizing.....")
        query=r.recognize_google(audio,language='en-in')
        print(f"User said: {query}\n")
    except Exception as e:
        print("Say that again please....")
        return "None"
    return query
def speak(audio):
    engine.say(audio)
    engine.runAndWait()

if __name__=="__main__":
    wishme()
while(1):
    query=takeCommand().lower()

    if "exit" in query:
        print("Good Bye Have a nice day sir")
        speak("Good Bye Have a nice day sir")
        exit()
    elif query =="who are you":
        print("I am Bruce")
        speak("I am Bruce")
    elif 'wikipedia' in query:
        try:
            speak("Searching Wikipedia.....")
            query=query.replace("wikipedia", "") #(old,new)
            results=wikipedia.summary(query,sentences=2)
            speak("According to Wikipedia")
            print(f"Acc. to wikipedia\n{results}")
            speak(results)
        except:
            print("No such result found")
            speak("No such result found")
    elif 'open youtube' in query:
        print("Opening Youtube...")
        speak("Opening Youtube")
        webbrowser.open("youtube.com")
    elif 'open google' in query:
        print("Opening Google...")
        speak("Opening google")
        webbrowser.open("google.com")
    elif 'open college' in query:
        print("Opening piet college website...")
        speak("Opening Piet college website")
        webbrowser.open("https://www.piet.co.in/")
    elif 'open my linkedin profile' in query:
        print("Opening Linkedin")
        speak("Opening Vansh Jain linkedin profile")
        webbrowser.open("https://www.linkedin.com/in/vansh-jain-990048224/")
    elif 'the time' in query:
        time=str((datetime.datetime.now().strftime("%H:%M:%S")))
        print(time)
        speak(time)
    elif 'who is your owner'==query:
        print("Vansh Jain is my owner")
        speak("Vansh Jain is my owner")
    elif 'open vs code' in query:
        print("Opening VS code")
        speak("Opening VS code")
        codepath="C:\\Users\\Vansh\\AppData\\Local\\Programs\\Microsoft VS Code\\Code.exe"
        os.startfile(codepath)
    

    else:
        print(query)

    


#Logic for execution based on query

    


