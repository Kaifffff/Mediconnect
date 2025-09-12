import React from 'react'
import Register from './Register'
import {BrowserRouter , Routes , Route , Link} from 'react-router-dom'
function DashBoard() {
  return (
    <>
     <div>DashBoard</div>
     
     <BrowserRouter>
     <Link to="/Register">Registration </Link>
     <Routes>
        <Route path="/Register" element={<Register/>}>
        </Route>
     </Routes>
     </BrowserRouter>


     </>
   
  )
}

export default DashBoard