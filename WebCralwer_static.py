import requests
from bs4 import BeautifulSoup
""" for link in soup.find_all('div',{'class':'video-box-title'}):
                href =link.get('titel')
                print(link.text)
def trade_spider (max_pages):
    page =1
    while page<=max_pages:
   
        url='https://www.programiz.com/java-programming/'
        source_code = requests.get(url)
        plain_text= source_code.text
        soup = BeautifulSoup(source_code.text, 'lxml')


        page += 1

##trade_spider(1)
"""
def findtext ():
    url = 'https://www.programiz.com/java-programming/'
    resp = requests.get(url)
    soup = BeautifulSoup(resp.text, 'lxml')
    for link in soup.find_all('a',{'class': 'sub-menu__link__column'}):
        href = link.get('href')
        print(link.text)


findtext()
