import React from 'react';

function Home() {
  return (
    <div className="container mt-4">
      <h1 className="text-center mb-4">Welcome to MediConnect</h1>
      <p className="lead text-center">
        Your trusted platform for managing appointments and connecting with healthcare professionals.
      </p>
      <div className="row mt-5">
        <div className="col-md-4">
          <div className="card text-center">
            <div className="card-body">
              <h5 className="card-title">Find Doctors</h5>
              <p className="card-text">Search and connect with verified doctors in your area.</p>
              <a href="/Display" className="btn btn-primary">Explore</a>
            </div>
          </div>
        </div>
        <div className="col-md-4">
          <div className="card text-center">
            <div className="card-body">
              <h5 className="card-title">Book Appointments</h5>
              <p className="card-text">Easily schedule and manage your healthcare appointments online.</p>
              <a href="#" className="btn btn-primary">Book Now</a>
            </div>
          </div>
        </div>
        <div className="col-md-4">
          <div className="card text-center">
            <div className="card-body">
              <h5 className="card-title">Contact Support</h5>
              <p className="card-text">Need assistance? Reach out to our support team anytime.</p>
              <a href="#" className="btn btn-primary">Get Help</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Home;
