-- Insert data for Persona
INSERT INTO persona (id_persona, nombre, apellido, fecha_nacimiento, genero, direccion, telefono) 
VALUES (1, 'Juan', 'Perez', '1990-01-01', 'M', 'Av. Siempre Viva 123', '123456789');
INSERT INTO persona (id_persona, nombre, apellido, fecha_nacimiento, genero, direccion, telefono) 
VALUES (2, 'Maria', 'Lopez', '1985-05-10', 'F', 'Calle Falsa 456', '987654321');
INSERT INTO persona (id_persona, nombre, apellido, fecha_nacimiento, genero, direccion, telefono) 
VALUES (3, 'Carlos', 'Gomez', '1992-12-25', 'M', 'Jr. Sin Nombre 789', '555555555');
INSERT INTO persona (id_persona, nombre, apellido, fecha_nacimiento, genero, direccion, telefono) 
VALUES (4, 'Ana', 'Martinez', '1988-03-15', 'F', 'Av. Principal 321', '444444444');
INSERT INTO persona (id_persona, nombre, apellido, fecha_nacimiento, genero, direccion, telefono) 
VALUES (5, 'Luis', 'Hernandez', '1995-08-20', 'M', 'Calle Secundaria 654', '333333333');
INSERT INTO persona (id_persona, nombre, apellido, fecha_nacimiento, genero, direccion, telefono) 
VALUES (6, 'Lucia', 'Fernandez', '1993-07-14', 'F', 'Av. Las Flores 234', '222222222');
INSERT INTO persona (id_persona, nombre, apellido, fecha_nacimiento, genero, direccion, telefono) 
VALUES (7, 'Miguel', 'Torres', '1987-11-30', 'M', 'Calle Los Pinos 678', '111111111');
INSERT INTO persona (id_persona, nombre, apellido, fecha_nacimiento, genero, direccion, telefono) 
VALUES (8, 'Laura', 'Gutierrez', '1991-09-23', 'F', 'Jr. Los Olivos 456', '999999999');
INSERT INTO persona (id_persona, nombre, apellido, fecha_nacimiento, genero, direccion, telefono) 
VALUES (9, 'Pedro', 'Garcia', '1986-04-18', 'M', 'Av. Los Robles 789', '888888888');
INSERT INTO persona (id_persona, nombre, apellido, fecha_nacimiento, genero, direccion, telefono) 
VALUES (10, 'Sofia', 'Ramirez', '1994-02-06', 'F', 'Calle Las Rosas 123', '777777777');

-- Insert data for Usuario
INSERT INTO usuario (id_usuario, username, password, email, estado) 
VALUES (1, 'jperez', 'password123', 'jperez@example.com', 'activo');
INSERT INTO usuario (id_usuario, username, password, email, estado) 
VALUES (2, 'mlopez', 'password123', 'mlopez@example.com', 'activo');
INSERT INTO usuario (id_usuario, username, password, email, estado) 
VALUES (3, 'cgomez', 'password123', 'cgomez@example.com', 'inactivo');
INSERT INTO usuario (id_usuario, username, password, email, estado) 
VALUES (4, 'amartinez', 'password123', 'amartinez@example.com', 'activo');
INSERT INTO usuario (id_usuario, username, password, email, estado) 
VALUES (5, 'lhernandez', 'password123', 'lhernandez@example.com', 'activo');
INSERT INTO usuario (id_usuario, username, password, email, estado) 
VALUES (6, 'lfernandez', 'password123', 'lfernandez@example.com', 'activo');
INSERT INTO usuario (id_usuario, username, password, email, estado) 
VALUES (7, 'mtorres', 'password123', 'mtorres@example.com', 'inactivo');
INSERT INTO usuario (id_usuario, username, password, email, estado) 
VALUES (8, 'lgutierrez', 'password123', 'lgutierrez@example.com', 'activo');
INSERT INTO usuario (id_usuario, username, password, email, estado) 
VALUES (9, 'pgarcia', 'password123', 'pgarcia@example.com', 'activo');
INSERT INTO usuario (id_usuario, username, password, email, estado) 
VALUES (10, 'sramirez', 'password123', 'sramirez@example.com', 'activo');

-- Insert data for Administrador
INSERT INTO administrador (id_administrador, id_persona, id_usuario, fecha_inicio, cargo) 
VALUES (1, 1, 1, '2020-01-01', 'Gerente General');
INSERT INTO administrador (id_administrador, id_persona, id_usuario, fecha_inicio, cargo) 
VALUES (2, 2, 2, '2019-05-15', 'Director de Operaciones');
INSERT INTO administrador (id_administrador, id_persona, id_usuario, fecha_inicio, cargo) 
VALUES (3, 3, 3, '2018-08-20', 'Jefe de Recursos Humanos');
INSERT INTO administrador (id_administrador, id_persona, id_usuario, fecha_inicio, cargo) 
VALUES (4, 4, 4, '2021-03-10', 'Director de Finanzas');
INSERT INTO administrador (id_administrador, id_persona, id_usuario, fecha_inicio, cargo) 
VALUES (5, 5, 5, '2017-11-30', 'Coordinador de Proyectos');
INSERT INTO administrador (id_administrador, id_persona, id_usuario, fecha_inicio, cargo) 
VALUES (6, 6, 6, '2020-07-20', 'Gerente de IT');
INSERT INTO administrador (id_administrador, id_persona, id_usuario, fecha_inicio, cargo) 
VALUES (7, 7, 7, '2018-01-25', 'Director de Marketing');
INSERT INTO administrador (id_administrador, id_persona, id_usuario, fecha_inicio, cargo) 
VALUES (8, 8, 8, '2019-09-10', 'Jefe de Ventas');
INSERT INTO administrador (id_administrador, id_persona, id_usuario, fecha_inicio, cargo) 
VALUES (9, 9, 9, '2021-11-05', 'Director de Desarrollo');
INSERT INTO administrador (id_administrador, id_persona, id_usuario, fecha_inicio, cargo) 
VALUES (10, 10, 10, '2016-04-01', 'Gerente de Innovación');

-- Insert data for Condicion
INSERT INTO condicion (id_condicion, nombre, descripcion) 
VALUES (1, 'Activo', 'Empleado en activo');
INSERT INTO condicion (id_condicion, nombre, descripcion) 
VALUES (2, 'Inactivo', 'Empleado inactivo');
INSERT INTO condicion (id_condicion, nombre, descripcion) 
VALUES (3, 'De baja', 'Empleado dado de baja');
INSERT INTO condicion (id_condicion, nombre, descripcion) 
VALUES (4, 'En licencia', 'Empleado en licencia temporal');
INSERT INTO condicion (id_condicion, nombre, descripcion) 
VALUES (5, 'Retirado', 'Empleado retirado');
INSERT INTO condicion (id_condicion, nombre, descripcion) 
VALUES (6, 'En entrenamiento', 'Empleado en periodo de entrenamiento');
INSERT INTO condicion (id_condicion, nombre, descripcion) 
VALUES (7, 'En evaluación', 'Empleado en periodo de evaluación');

-- Insert data for Ubigeo
INSERT INTO ubigeo (id_ubigeo, departamento, provincia, distrito, codigo_postal) 
VALUES (1, 'Lima', 'Lima', 'Miraflores', '15074');
INSERT INTO ubigeo (id_ubigeo, departamento, provincia, distrito, codigo_postal) 
VALUES (2, 'Lima', 'Lima', 'San Isidro', '15073');
INSERT INTO ubigeo (id_ubigeo, departamento, provincia, distrito, codigo_postal) 
VALUES (3, 'Lima', 'Lima', 'Barranco', '15063');
INSERT INTO ubigeo (id_ubigeo, departamento, provincia, distrito, codigo_postal) 
VALUES (4, 'Cusco', 'Cusco', 'Wanchaq', '08002');
INSERT INTO ubigeo (id_ubigeo, departamento, provincia, distrito, codigo_postal) 
VALUES (5, 'Arequipa', 'Arequipa', 'Yanahuara', '04013');
INSERT INTO ubigeo (id_ubigeo, departamento, provincia, distrito, codigo_postal) 
VALUES (6, 'La Libertad', 'Trujillo', 'Víctor Larco Herrera', '13009');
INSERT INTO ubigeo (id_ubigeo, departamento, provincia, distrito, codigo_postal) 
VALUES (7, 'Piura', 'Piura', 'Castilla', '20001');
INSERT INTO ubigeo (id_ubigeo, departamento, provincia, distrito, codigo_postal) 
VALUES (8, 'Junín', 'Huancayo', 'El Tambo', '12000');
INSERT INTO ubigeo (id_ubigeo, departamento, provincia, distrito, codigo_postal) 
VALUES (9, 'Puno', 'Puno', 'Juliaca', '21001');
INSERT INTO ubigeo (id_ubigeo, departamento, provincia, distrito, codigo_postal) 
VALUES (10, 'Loreto', 'Maynas', 'Iquitos', '16001');

-- Insert data for Paciente
INSERT INTO paciente (id_paciente, id_persona, id_usuario, id_condicion, id_ubigeo, fecha_registro) 
VALUES (1, 1, 1, 1, 1, '2022-01-01');
INSERT INTO paciente (id_paciente, id_persona, id_usuario, id_condicion, id_ubigeo, fecha_registro) 
VALUES (2, 2, 2, 2, 2, '2022-05-15');
INSERT INTO paciente (id_paciente, id_persona, id_usuario, id_condicion, id_ubigeo, fecha_registro) 
VALUES (3, 3, 3, 3, 3, '2022-08-20');
INSERT INTO paciente (id_paciente, id_persona, id_usuario, id_condicion, id_ubigeo, fecha_registro) 
VALUES (4, 4, 4, 4, 4, '2021-04-01');
INSERT INTO paciente (id_paciente, id_persona, id_usuario, id_condicion, id_ubigeo, fecha_registro) 
VALUES (5, 5, 5, 5, 5, '2020-09-25');
INSERT INTO paciente (id_paciente, id_persona, id_usuario, id_condicion, id_ubigeo, fecha_registro) 
VALUES (6, 6, 6, 6, 6, '2021-12-14');
INSERT INTO paciente (id_paciente, id_persona, id_usuario, id_condicion, id_ubigeo, fecha_registro) 
VALUES (7, 7, 7, 1, 7, '2022-03-10');
INSERT INTO paciente (id_paciente, id_persona, id_usuario, id_condicion, id_ubigeo, fecha_registro) 
VALUES (8, 8, 8, 2, 8, '2022-11-05');
INSERT INTO paciente (id_paciente, id_persona, id_usuario, id_condicion, id_ubigeo, fecha_registro) 
VALUES (9, 9, 9, 3, 9, '2021-07-18');
INSERT INTO paciente (id_paciente, id_persona, id_usuario, id_condicion, id_ubigeo, fecha_registro) 
VALUES (10, 10, 10, 4, 10, '2020-02-28');

-- Insert data for Genero
INSERT INTO genero (id_genero, nombre) 
VALUES (1, 'Masculino');
INSERT INTO genero (id_genero, nombre) 
VALUES (2, 'Femenino');

-- Insert data for Jornada
INSERT INTO jornada (id_jornada, nombre, descripcion) 
VALUES (1, 'Mañana', 'Jornada matutina de trabajo');
INSERT INTO jornada (id_jornada, nombre, descripcion) 
VALUES (2, 'Tarde', 'Jornada vespertina de trabajo');
INSERT INTO jornada (id_jornada, nombre, descripcion) 
VALUES (3, 'Noche', 'Jornada nocturna de trabajo');
INSERT INTO jornada (id_jornada, nombre, descripcion) 
VALUES (4, 'Completa', 'Jornada completa de trabajo');

-- Insert data for Especialidad
INSERT INTO especialidad (id_especialidad, nombre, descripcion) 
VALUES (1, 'Cardiología', 'Especialidad médica que trata enfermedades del corazón');
INSERT INTO especialidad (id_especialidad, nombre, descripcion) 
VALUES (2, 'Neurología', 'Especialidad médica que trata enfermedades del sistema nervioso');
INSERT INTO especialidad (id_especialidad, nombre, descripcion) 
VALUES (3, 'Pediatría', 'Especialidad médica que trata enfermedades en niños');
INSERT INTO especialidad (id_especialidad, nombre, descripcion) 
VALUES (4, 'Dermatología', 'Especialidad médica que trata enfermedades de la piel');

-- Insert data for Especialista
INSERT INTO especialista (id_especialista, id_persona, id_especialidad, experiencia_anios) 
VALUES (1, 1, 1, 5);
INSERT INTO especialista (id_especialista, id_persona, id_especialidad, experiencia_anios) 
VALUES (2, 2, 2, 3);
INSERT INTO especialista (id_especialista, id_persona, id_especialidad, experiencia_anios) 
VALUES (3, 3, 3, 10);
INSERT INTO especialista (id_especialista, id_persona, id_especialidad, experiencia_anios) 
VALUES (4, 4, 4, 7);
INSERT INTO especialista (id_especialista, id_persona, id_especialidad, experiencia_anios) 
VALUES (5, 5, 1, 4);
INSERT INTO especialista (id_especialista, id_persona, id_especialidad, experiencia_anios) 
VALUES (6, 6, 2, 8);
INSERT INTO especialista (id_especialista, id_persona, id_especialidad, experiencia_anios) 
VALUES (7, 7, 3, 2);
INSERT INTO especialista (id_especialista, id_persona, id_especialidad, experiencia_anios) 
VALUES (8, 8, 4, 6);
INSERT INTO especialista (id_especialista, id_persona, id_especialidad, experiencia_anios) 
VALUES (9, 9, 1, 1);
INSERT INTO especialista (id_especialista, id_persona, id_especialidad, experiencia_anios) 
VALUES (10, 10, 2, 9);

-- Insert data for Dia
INSERT INTO dia (id_dia, nombre, descripcion) 
VALUES (1, 'Lunes', 'Día de la semana');
INSERT INTO dia (id_dia, nombre, descripcion) 
VALUES (2, 'Martes', 'Día de la semana');
INSERT INTO dia (id_dia, nombre, descripcion) 
VALUES (3, 'Miércoles', 'Día de la semana');
INSERT INTO dia (id_dia, nombre, descripcion) 
VALUES (4, 'Jueves', 'Día de la semana');
INSERT INTO dia (id_dia, nombre, descripcion) 
VALUES (5, 'Viernes', 'Día de la semana');
INSERT INTO dia (id_dia, nombre, descripcion) 
VALUES (6, 'Sábado', 'Día de la semana');
INSERT INTO dia (id_dia, nombre, descripcion) 
VALUES (7, 'Domingo', 'Día de la semana');

-- Insert data for TipoUsuario
INSERT INTO tipousuario (id_tipousuario, nombre, descripcion) 
VALUES (1, 'Admin', 'Usuario con privilegios administrativos');
INSERT INTO tipousuario (id_tipousuario, nombre, descripcion) 
VALUES (2, 'Usuario', 'Usuario regular con acceso limitado');
INSERT INTO tipousuario (id_tipousuario, nombre, descripcion) 
VALUES (3, 'Invitado', 'Usuario con acceso restringido');
INSERT INTO tipousuario (id_tipousuario, nombre, descripcion) 
VALUES (4, 'SuperAdmin', 'Usuario con todos los privilegios');
INSERT INTO tipousuario (id_tipousuario, nombre, descripcion) 
VALUES (5, 'Operador', 'Usuario encargado de operaciones específicas');
