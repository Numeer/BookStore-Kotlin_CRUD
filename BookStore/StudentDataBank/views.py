#from django.shortcuts import render

# Create your views here.

from django.http import HttpResponse
from .models import Book
from django.core import serializers

def index(request):
    return HttpResponse("Welcome to Mobile App Development with BITF20")

def all_books(request):
    data = serializers.serialize('json', Book.objects.all())
    return HttpResponse(data)

def del_book(request):
    Book.objects.filter(roll_number=request.GET['name']).delete()
    return HttpResponse("record of "+request.GET['name']+" is deleted successfully")

def add_book(request):
    if request.method == 'GET':
        book = Book(
            name=request.GET.get('name', ''), 
            author=request.GET.get('author', ''),
            price=float(request.GET.get('price', 0.0)),
            number_of_pages=int(request.GET.get('noOfPages', 0)),
            language=request.GET.get('language', ''),
            genre=request.GET.get('genre', ''),
            description=request.GET.get('description', ''),
            published=request.GET.get('published', ''),
        )
        book.save()

        return HttpResponse(f"Record of {book.name} is added, if it does not exist already!")

    return HttpResponse("Invalid request method")