import React, { useEffect, useState } from 'react'
import axios from 'axios'
function Display() {
    const [record , setRecord]=useState([]);

    useEffect(() => {
        axios.get("http://localhost:8080/Doctors")
            .then(res => {
                setRecord(res.data);
                console.log(res.data); // Log the data after it's fetched
            })
            .catch(error => {
                console.error("Error fetching data:", error);
            });
    }, []);

  return (
    	//  private String name;
	//  private String email;
	//  private String password;
	//  private String specialization;
  //    private int experience;
  //    private String availableFrom;
  //    private String availableTo;
  //    private double consultationFee;
    <>
    <div>Display</div>
    <table border="1px">
        <tr>
            <th>name</th>
            <th>email</th>
            <th>password</th>
            <th>specialization</th>
            <th>experience</th>
            <th>availableFrom</th>
            <th>availableTo</th>
            <th>consultationFee</th>
        </tr>
       <tbody>
      {
        record.map((res,ind)=>(
            <tr key={ind}>
                <td>{res.name}</td>
                 <td>{res.email}</td>
                  <td>{res.password}</td>
                   <td>{res.specialization}</td>
                   <td>{res.experience}</td>
                    <td>{res.availableFrom}</td>
                    <td>{res.availableTo}</td>
                    <td>{res.consultationFee}</td>
            </tr>
        ))
      }
        

        </tbody> 
    </table>
    
    </>
    
  )
}

export default Display