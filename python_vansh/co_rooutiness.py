
import time

def searcher():
    book="this is a book"
    time.sleep(4)
    while(1):
        text=(yield)
        if text in book:
            print("your text is in the book")
        else:
            print("text is not in the book")

search=searcher()
next(search)
search.send("harry")
search.send("book")

search.close()




