import React from "react";
import "bootstrap/dist/css/bootstrap.css";
function Register() {
  const saveData=()=>{
    console.log("save");
  }


  return (
    <>
      <div className="row">
        <div className="col"></div>
        <div className="col">
          <form>
            <div className="mb-3">
              <label for="name" className="form-label">
                Name
              </label>
              <input
                type="email"
                className="form-control"
                id="name"
              />
            </div>
            <div className="mb-3">
              <label for="Email" className="form-label">
                Email address
              </label>
              <input
                type="email"
                className="form-control"
                id="Email"
                aria-describedby="emailHelp"
              />
              <div id="emailHelp" className="form-text">
                We'll never share your email with anyone else.
              </div>
            </div>
            <div className="mb-3">
              <label for="pass" className="form-label">
                Password
              </label>
              <input
                type="password"
                className="form-control"
                id="pass"
              />
            </div>
            <div className="mb-3">
              <label for="specialization" className="form-label">
                Specialization
              </label>
              <input
                type="email"
                className="form-control"
                id="specialization"
              />
            </div>
            <div className="mb-3">
              <label for="exp" className="form-label">
                Experience
              </label>
              <input
                type="email"
                className="form-control"
                id="exp"
              />
            </div>
            <div className="mb-3">
              <label for="avlf" className="form-label">
                availableFrom
              </label>
              <input
                type="email"
                className="form-control"
                id="avlf"
              />
            </div>
            <div className="mb-3">
              <label for="avlt" className="form-label">
                availableTo
              </label>
              <input
                type="email"
                className="form-control"
                id="avlt"
              />
            </div>
            <div className="mb-3">
              <label for="cons" className="form-label">
                consultationFee
              </label>
              <input
                type="email"
                className="form-control"
                id="cons"
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
