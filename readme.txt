{
    "title": "Noor Cook Book",
    "desc":"This is my first Cook book",
    "price":100000,
    "author":"Noor",
    "pages":20000
}
https://localhost:8009/books/  - GET

https://localhost:8009/books/1 - GET

https://localhost:8009/books - POST


query {
    allBooks {
        desc
    }
}

query {
    getBook(bookId:2) {
        id
        author
        desc
    }
}

mutation {
    create(book:{
        title: "Life Book",
        desc:"This is my first Life book",
        price:100000,
        author:"Sujathullah",
        pages:6500
    }){
        id
    }
}

http://localhost:8009/graphql

select * from project_books