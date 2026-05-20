 import "./App.css" 
import Student from "./Student"; 
function App() { 
  return ( 
    <div id= "app"> 
      <h1>Student Information</h1> 
      <div id= "items"> 
      <Student 
      name = "Avinash Kumar" 
      course = "Computer Science" 
      marks = "100"/> 
      <Student 
      name = "Ananya Singh" 
      course = "Information Technology" 
      marks = "92"/> 
      <Student 
      name = "Tarun Kumar" 
      course = "Maths" 
      marks = "10"/> 
      </div> 
    </div> 
  ); 
} 
export default App; 