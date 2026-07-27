import React from "react";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  // Element Variable
  let books;

  if (showBooks) {
    books = <BookDetails />;
  }

  return (
    <div style={{ margin: "20px" }}>
      <h1>Blogger App</h1>

      {/* if-else using element variable */}
      {books}

      <hr />

      {/* Ternary Operator */}
      {showBlogs ? <BlogDetails /> : <h2>No Blogs Available</h2>}

      <hr />

      {/* Logical && */}
      {showCourses && <CourseDetails />}
    </div>
  );
}

export default App;
