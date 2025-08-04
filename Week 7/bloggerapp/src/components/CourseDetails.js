import React from "react";

const CourseDetails = ({ courses }) => {
  return (
    <>
      {courses?.length ? (
        courses.map((course, index) => (
          <div key={index}>
            <h3>{course.name}</h3>
            <p>{course.date}</p>
          </div>
        ))
      ) : (
        <p>No Courses Available</p>
      )}
    </>
  );
};

export default CourseDetails;
