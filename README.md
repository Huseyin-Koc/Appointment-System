# 🩺 Appointment System (Java + Spring Boot)

This project is a medical appointment tracking system built with Spring Boot and MySQL, featuring patient, doctor, and admin panels.
Users can book appointments, doctors can approve or reject them, and all data is managed through a relational database.
The interface is fully in Turkish, designed for ease of use in local healthcare environments.

## 🚀 Features

- Patient, doctor, and admin panels
- Appointment creation, approval, and rejection
- Status tracking for each appointment
- MySQL database integration via TablePlus
- Turkish interface with responsive design

## 🖼 Screenshots


### 📅 Appointment Booking Screen

> The patient selects a doctor and a date to create a new appointment.

![Randevu Alma](https://github.com/user-attachments/assets/79892fc4-e942-46a3-8e26-f471f41b5a6d)

---

### 🧑‍⚕️ Patient Panel

> The patient can view available doctors and track past appointments.

![Hasta Paneli](https://github.com/user-attachments/assets/ff418947-16e0-48d4-b660-cdcbf83e4886)

### 🩻 Doctor Panel

> Doctors can view pending and confirmed appointments and manage their schedules.

![Doktor Paneli](https://github.com/user-attachments/assets/e8b9b62a-fd4f-4bef-a00b-d20c3e09c091)

---

### 🛠 Admin Panel

> Admins manage users, view system-wide data, and access all appointments.

![Admin Paneli](https://github.com/user-attachments/assets/7f773a27-9ff5-4a60-8165-36ae8ec55a52)

---

### 🗄 Database View (TablePlus)

> Appointment and user tables are stored in a relational MySQL database.

![Veritabanı Görseli](https://github.com/user-attachments/assets/7cf77348-bdfc-4884-b531-e4fdcc4042ae)

---

## 🧰 Technologies Used

- **Java**
- **Spring Boot**
- **MySQL**
- **TablePlus**
- **HTML/CSS with Bootstrap**
- **Maven** (for dependency management)

## 📦 Setup Instructions

1. Clone the repository  
   `git clone https://github.com/your-username/randevu-sistemi-java`

2. Configure MySQL credentials in `application.properties`

3. Run the project using Spring Boot  
   `./mvnw spring-boot:run`

4. Access the panels via your browser:
   - Patient Panel: `/patient`
   - Doctor Panel: `/doctor`
   - Admin Panel: `/admin`

## 📜 License

This project is open-source and available under the MIT License.
