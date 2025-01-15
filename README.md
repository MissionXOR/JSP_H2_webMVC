# JSP_H2_webMVC
# Product Management System

A **Product Management System** built using **JSP**, **Spring MVC**, and **H2 Database** to perform basic CRUD (Create, Read, Update, Delete) operations. This project demonstrates a clear understanding of web development, MVC design patterns, and database integration. The system allows users to manage product information seamlessly.

---

## Features

- Add new products with attributes such as name, price, and quantity.
- View a list of all products.
- Update existing product details.
- Delete products from the system.
- Simple and clean user interface.
- Integration with in-memory H2 database for quick setup and testing.

---

## Technology Stack

### Backend:
- **Java 8+**
- **Spring MVC**
- **H2 Database** (In-memory database for development and testing)

### Frontend:
- **JSP (JavaServer Pages)**
- **HTML5**
- **CSS**

### Tools & Build:
- **Eclipse IDE**
- **Apache Maven**
- **Tomcat Server** (Embedded in Spring Boot for testing)

---

## Installation & Setup

### Prerequisites:
1. Java 8 or higher installed.
2. Apache Maven installed.
3. Eclipse IDE (or any Java-compatible IDE).

### Steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/MissionXOR/JSP_H2_webMVC.git
   cd JSP_H2_webMVC
   ```

2. **Import the Project into Eclipse**:
   - Open Eclipse.
   - Go to `File > Import > Existing Maven Projects`.
   - Select the project directory and click `Finish`.

3. **Run the Application**:
   - Right-click on the project.
   - Select `Run As > Run on Server` and choose the Tomcat server.

4. **Access the Application**:
   - Open your browser and navigate to `http://localhost:8080/`.

---

## Usage

1. **Add Product**:
   - Navigate to the homepage.
   - Enter product details (Name, Price, Quantity) in the form and click `Save`.

2. **View Products**:
   - The homepage displays a table of all existing products.

3. **Edit Product**:
   - Click the `Edit` button next to a product to update its details.

4. **Delete Product**:
   - Click the `Delete` button next to a product to remove it.

---

## Database Configuration

- The application uses an **H2 Database** in-memory mode.
- H2 Console can be accessed at `http://localhost:8080/h2-console`.
- Default credentials:
  - **URL**: `jdbc:h2:mem:testdb`
  - **Username**: `jovan`
  - **Password**: *1234*

---

## Future Enhancements

- Add user authentication and role-based access control.
- Implement pagination and sorting for product listings.
- Enable file uploads for product images.
- Integrate with a persistent database like MySQL or PostgreSQL.

---

## Contributions

Feel free to fork this repository and contribute by submitting a pull request. For major changes, please open an issue first to discuss your ideas.

---

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---

## Contact

- **Name**: MD AMINUL ISLAM
- **Email**: your-email@example.com
- **GitHub**: [github.com/MissionXOR](https://github.com/MissionXOR)
- **LinkedIn**: [linkedin.com/in/aminul-jovan](https://www.linkedin.com/in/aminul-jovan/)

---

Thank you for exploring this project! I hope this demonstrates my skills in web development and MVC frameworks.

