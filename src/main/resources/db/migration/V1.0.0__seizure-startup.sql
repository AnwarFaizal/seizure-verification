/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  PejalHebat
 * Created: 26 Apr 2023
 */

CREATE TABLE IF NOT EXISTS seizure (
   id serial PRIMARY KEY,
   seizure_date TIMESTAMP NOT NULL,
   location VARCHAR(255)
);
