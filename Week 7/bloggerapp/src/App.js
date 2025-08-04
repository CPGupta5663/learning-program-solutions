import React, { useState } from "react";
import "./App.css";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

export const books = [
  { id: 101, bname: "Master React", price: 670 },
  { id: 102, bname: "Deep Dive into Angular 11", price: 800 },
  { id: 103, bname: "Mongo Essentials", price: 450 },
];

export const courses = [
  { name: "Angular", date: "4/5/2021" },
  { name: "React", date: "6/3/20201" },
];

function App() {
  const [showBooks, setShowBooks] = useState(true);
  const [showCourses, setShowCourses] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);

  return (
    <div className="mainContainer">
      <div className="section st2">
        <h1>Book Details</h1>
        {showBooks && <BookDetails books={books} />}
      </div>

      <div className="section v1">
        <h1>Blog Details</h1>
        <BlogDetails showBlogs={showBlogs} />
      </div>

      <div className="section mystyle1">
        <h1>Course Details</h1>
        {showCourses ? <CourseDetails courses={courses} /> : <p>No courses shown</p>}
      </div>
    </div>
  );
}

export default App;
