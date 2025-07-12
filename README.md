<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
</head>
<body>

  <h1>🛠️ Trabajo Final - TechLab Demo API</h1>
  <p><strong>Autora:</strong> Ivana RomeroTreppo</p>
  <p><strong>Fecha:</strong> Julio 2025</p>
  <p><strong>Curso:</strong> Backend con Java - Talento Tech</p>

  <div class="section">
    <h2>📌 Descripción del Proyecto</h2>
    <p>Este proyecto representa una API web desarrollada como trabajo final para el curso de backend. Se trata de una aplicación backend de gestión de productos, pedidos y usuarios con autenticación basada en roles utilizando JWT. Se usaron herramientas modernas como Spring Boot, Spring Security, MySQL y Lombok.</p>
  </div>

  <div class="section">
    <h2>🔧 Tecnologías Utilizadas</h2>
    <ul>
      <li>Lenguaje: Java 23</li>
      <li>Framework: Spring Boot, Spring Security</li>
      <li>ORM: Spring Data JPA</li>
      <li>Base de datos: MySQL (Workbench)</li>
      <li>Dependencias: Lombok, Dotenv</li>
      <li>IDE: IntelliJ IDEA</li>
      <li>Testing: Postman</li>
      <li>Build: Maven</li>
    </ul>
  </div>

  <div class="section">
    <h2>🏗️ Estructura del Proyecto</h2>
    <pre><code>
src/main/java/com/techlab/demo
├── config          → Configuración de seguridad y aplicación
├── controller      → Controladores REST
├── entity          → Entidades JPA: Usuario, Producto, Pedido, etc.
├── repository      → Repositorios JPA
├── services        → Lógica de negocio
└── DemoApplication.java
    </code></pre>
  </div>

  <div class="section">
    <h2>⚙️ Cómo Ejecutar el Proyecto</h2>
    <ol>
      <li>Clonar el repositorio:<br>
        <code>git clone https://github.com/Ivanart1498/TechLabDemoAPI.git</code></li>
      <li>Crear un archivo <code>.env</code> con:<br>
        <code>MY_CONTRASENA=tu_clave_mysql</code></li>
      <li>Crear una base de datos en MySQL llamada <code>techlab_demo</code>.</li>
      <li>Configurar <code>application.properties</code>:</li>
    </ol>
    <pre><code>
spring.datasource.url=jdbc:mysql://localhost:3306/techlab_demo
spring.datasource.username=root
spring.datasource.password=${MY_CONTRASENA}
spring.jpa.hibernate.ddl-auto=update
    </code></pre>
    <p>Luego, ejecutar con:</p>
    <code>./mvnw spring-boot:run</code>
  </div>

  <div class="section">
    <h2>🔐 Seguridad</h2>
    <p>La aplicación está protegida mediante JWT y roles. Para crear un usuario admin inicial, se puede descomentar el <code>@Bean initAdmin(...)</code> en <code>DemoApplication.java</code>.</p>
  </div>

  <div class="section">
    <h2>📬 Contacto</h2>
    <p><strong>Ivana Treppo</strong><br>
      <a href="mailto:ivanaromerotreppo@gmail.com">ivanaromerotreppo@gmail.com</a><br>
      <a href=https://www.linkedin.com/in/ivana-romero-treppo-76739b289/>LinkedIn</a>
    </p>
  </div>

  <hr>

  <h1>🛠️ Final Project - TechLab Demo API</h1>
  <p><strong>Author:</strong> Ivana Romero Treppo</p>
  <p><strong>Date:</strong> July 2025</p>
  <p><strong>Course:</strong> Java Backend - Talento Tech</p>

  <div class="section">
    <h2>📌 Project Description</h2>
    <p>This is a backend REST API developed as a final project for the backend course. It manages users, products, and orders with role-based authentication using JWT. Modern technologies such as Spring Boot, Spring Security, MySQL, and Lombok were used.</p>
  </div>

  <div class="section">
    <h2>🔧 Technologies Used</h2>
    <ul>
      <li>Language: Java 23</li>
      <li>Framework: Spring Boot, Spring Security</li>
      <li>ORM: Spring Data JPA</li>
      <li>Database: MySQL (Workbench)</li>
      <li>Dependencies: Lombok, Dotenv</li>
      <li>IDE: IntelliJ IDEA</li>
      <li>Testing: Postman</li>
      <li>Build Tool: Maven</li>
    </ul>
  </div>

  <div class="section">
    <h2>🏗️ Project Structure</h2>
    <pre><code>
src/main/java/com/techlab/demo
├── config          → Security and app configuration
├── controller      → REST API endpoints
├── entity          → JPA entities: Usuario, Producto, Pedido, etc.
├── repository      → JPA repositories
├── services        → Business logic
└── DemoApplication.java
    </code></pre>
  </div>

  <div class="section">
    <h2>⚙️ How to Run</h2>
    <ol>
      <li>Clone the repo:<br>
        <code>git clone https://github.com/Ivanart1498/TechLabDemoAPI.git</code></li>
      <li>Create a <code>.env</code> file with:<br>
        <code>MY_CONTRASENA=your_mysql_password</code></li>
      <li>Create a MySQL database named <code>techlab_demo</code>.</li>
      <li>Update <code>application.properties</code>:</li>
    </ol>
    <pre><code>
spring.datasource.url=jdbc:mysql://localhost:3306/techlab_demo
spring.datasource.username=root
spring.datasource.password=${MY_CONTRASENA}
spring.jpa.hibernate.ddl-auto=update
    </code></pre>
    <p>Then, run the app:</p>
    <code>./mvnw spring-boot:run</code>
  </div>

  <div class="section">
    <h2>🔐 Security</h2>
    <p>The application is protected using JWT and roles. You can enable default admin creation by uncommenting <code>@Bean initAdmin(...)</code> in <code>DemoApplication.java</code>.</p>
  </div>

  <div class="section">
    <h2>📬 Contact</h2>
    <p><strong>Ivana Treppo</strong><br>
      <a href="mailto:ivanaromerotreppo@gmail.com">ivanaromerotreppo@gmail.com</a><br>
      <a href=https://www.linkedin.com/in/ivana-romero-treppo-76739b289/>LinkedIn</a>
    </p>
  </div>

</body>
</html>

