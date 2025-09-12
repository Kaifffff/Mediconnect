import React, { useState } from "react";
import "bootstrap/dist/css/bootstrap.css";
import axios from 'axios'
function Register() {
  const [name,setName] = useState(''); 
  const [email,setEmail] = useState(''); 
  const [pass,setPass] = useState(''); 
  const [spec,setSpec] = useState(''); 
  const [exp,setExp] = useState(''); 
  const [avlfrom,setAvlfrom] = useState(''); 
  const [avlto,setAvlto] = useState(''); 
  const [consfee,setConsfee] = useState(''); 

  //  private Long id;
	//  private String name;
	//  private String email;
	//  private String password;
	//  private String specialization;
  //    private int experience;
  //    private String availableFrom;
  //    private String availableTo;
  //    private double consultationFee;

  const saveData=()=>{
    axios.post("http://localhost:8080/Doctors",{name : name , email:email ,
      password : pass,specialization:spec ,experience:exp,
      availableFrom : avlfrom , availableTo:avlto , consultationFee:consfee
    }).then((r)=>{
      console.log(r.data);
      alert("registration Successfull");
    })
  }


  return (
    <>
      <div className="row">
        <div className="col"></div>
        <div className="col">
          <form>
            <div className="mb-3">
              <label htmlFor="name" className="form-label">
                Name
              </label>
              <input
                type="text"
                className="form-control"
                id="name"
                value={name} 
                onChange={(e)=>setName(e.target.value)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="Email" className="form-label">
                Email address
              </label>
              <input
                type="email"
                className="form-control"
                id="Email"
                aria-describedby="emailHelp"
                value={email} 
                onChange={(e)=>setEmail(e.target.value)}
              />
              <div id="emailHelp" className="form-text">
                We'll never share your email with anyone else.
              </div>
            </div>
            <div className="mb-3">
              <label htmlFor="pass" className="form-label">
                Password
              </label>
              <input
                type="password"
                className="form-control"
                id="pass"
                value={pass} 
                onChange={(e)=>setPass(e.target.value)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="specialization" className="form-label">
                Specialization
              </label>
              <input
                type="text"
                className="form-control"
                id="specialization"
                value={spec} 
                onChange={(e)=>setSpec(e.target.value)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="exp" className="form-label">
                Experience
              </label>
              <input
                type="number"
                className="form-control"
                id="exp"
                value={exp} 
                onChange={(e)=>setExp(e.target.value)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="avlf" className="form-label">
                availableFrom
              </label>
              <input
                type="text"
                className="form-control"
                id="avlf"
                value={avlfrom} 
                onChange={(e)=>setAvlfrom(e.target.value)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="avlt" className="form-label">
                availableTo
              </label>
              <input
                type="text"
                className="form-control"
                id="avlt"
                value={avlto} 
                onChange={(e)=>setAvlto(e.target.value)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="cons" className="form-label">
                consultationFee
              </label>
              <input
                type="number"
                className="form-control"
                id="cons"
                value={consfee} 
                onChange={(e)=>setConsfee(e.target.value)}
              />
            </div>
            <button type="submit" className="btn btn-primary" onClick={saveData}>
              Submit
            </button>
          </form>
        </div>
        <div className="col"></div>
      </div>
    </>
  );
}

export default Register;
