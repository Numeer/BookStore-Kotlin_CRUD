'''
Created on 20-Nov-2023

@author: mianm
'''

from django.urls import path

from . import views

urlpatterns = [
    path("", views.index, name="index"),
    path("allBooks", views.all_books, name="allBooks"),
    path("delBook", views.del_book, name="deBook"),
    path("addBook", views. add_book, name=" addBook"),
]