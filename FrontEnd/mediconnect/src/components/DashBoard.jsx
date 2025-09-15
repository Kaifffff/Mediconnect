import React from 'react'
import Register from './Register'
import {BrowserRouter , Routes , Route , Link} from 'react-router-dom'
import Display from './Display'
import Navbar from './Navbar'
import Home from './Home'
import DoctorList from './DoctorsList'
function DashBoard() {
  return (
    <>
     <Navbar/>
     <Home/>
     <BrowserRouter>

      {/* Routes */}
      <div>
        <Routes>
          <Route path="/register" element={<Register />} />
          <Route path="/display" element={<Display/>} />
          <Route path="/DoctorList" element={<DoctorList/>}/>

        </Routes>
      </div>
    </BrowserRouter>
    
     </>
   
  )
}

export default DashBoard