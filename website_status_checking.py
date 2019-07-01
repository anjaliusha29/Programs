import requests
import json

URL="https://www.tutorialspoint.com/python/python_http_response.htm"
r = requests.get(url = URL) 
code=r.status_code


if code==503:
	print("Website down")
if code==200:
	print("website up")





