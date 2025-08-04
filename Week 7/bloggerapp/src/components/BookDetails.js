import React from "react";

const BookDetails = (props) => {
  return (
    <ul>
      {props.books.length > 0 ? (
        props.books.map((book) => (
          <div key={book.id}>
            <h3>{book.bname}</h3>
            <h4>{book.price}</h4>
          </div>
        ))
      ) : (
        <p>No books available</p>
      )}
    </ul>
  );
};

export default BookDetails;
