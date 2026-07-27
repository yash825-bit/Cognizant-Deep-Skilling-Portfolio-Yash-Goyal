import React from "react";

function BookDetails() {
  const books = [
    {
      id: 1,
      title: "The Alchemist",
      author: "Paulo Coelho",
      price: 450,
    },
    {
      id: 2,
      title: "Atomic Habits",
      author: "James Clear",
      price: 550,
    },
    {
      id: 3,
      title: "Clean Code",
      author: "Robert C. Martin",
      price: 700,
    },
  ];

  return (
    <div>
      <h2>Book Details</h2>

      <ul>
        {books.map((book) => (
          <li key={book.id}>
            {book.title} | {book.author} | ₹{book.price}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default BookDetails;
