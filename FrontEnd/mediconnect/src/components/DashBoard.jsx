import React from 'react'
import Register from './Register'
import {BrowserRouter , Routes , Route , Link} from 'react-router-dom'
import Display from './Display'
import Navbar from './Navbar'
function DashBoard() {
  return (
    <>
     <div>DashBoard</div>
     
     <BrowserRouter>
     <Link to="/Register">Registration </Link>
     <Link to="/Display">Display </Link>
     <Routes>
        <Route path="/Register" element={<Register/>}/>
        <Route path="/Display" element={<Display/>}/>
     </Routes>
     </BrowserRouter>
     </>
   
  )
}

export default DashBoard