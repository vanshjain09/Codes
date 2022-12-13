import requests
r=requests.get("https://financialmodelingprep.com/api/v3/financial-statement-symbol-lists?apikey")
print(r.text)
url=" http://www.youtube.com"

data={
    "n1":'harsh' ,
    "n2":'ashish'
}
r2=requests.post(url=url,data=data)
print(r2.status_code)

#to pass the parameters in url
payload={"key1":"value 1"}
req=requests.get("https://www.geeksforgeeks.org/python-requests-tutorial/",params=payload)
print(req.url)
print(req.status_code)

#also we can work with headers and cookies
print(req.cookies)
print(req.headers)
#also we can add our owm cookies to the url in cookie jar




