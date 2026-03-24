public class Dueno {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String cedula;
    
    public Dueno(String nombre, String apellido, String telefono, String email, String cedula) {
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setEmail(email);
        setCedula(cedula);
    }
    
    
    // Getters y Setters con validaciones: 

	public String getNombre() {
		return nombre;
	}
	
	// Valido que no este vacio, sin espacio y asigno desconocido  nombre y apellido 
    // Uso Operador ternario para validar y asignar valor por defecto
	public void setNombre(String nombre) {
        this.nombre = (nombre == null || nombre.trim().isEmpty()) ? "Desconocido" : nombre.trim();
    }
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
	     this.apellido = (apellido == null || apellido.trim().isEmpty()) ? "Desconocido"  : apellido.trim();           
	 }
	
	public String getTelefono() {
		return telefono;
	}
	
    // Valido que el telefono tenga 10 digitos y solo numeros, en caso contrario asigno 0000...
	public void setTelefono(String telefono) {
        boolean valido = telefono != null && telefono.matches("\\d{10}");
        this.telefono = valido ? telefono : "0000000000";
    }
	
	public String getEmail() {
		return email;
	}
	
	// Valido que el email contenga '@' y un punto después del '@', en caso contrario asigno
	public void setEmail(String email) {
        if (email != null && email.contains("@") && email.indexOf("@") < email.lastIndexOf(".")) {
            this.email = email;
        } else {
            this.email = "sin@email.com";
        }
    }
	
	public String getCedula() {
		return cedula;
	}
	
	// Valiadcion cedula no espacio, vacio y en caso asignar 0000...
	public void setCedula(String cedula) {
        this.cedula = (cedula == null || cedula.trim().isEmpty()) ? "0000000000" : cedula.trim();
    }
	

  // Métodos adicionales nombres completos y validación de email y toString:
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public boolean tieneEmailValido() {
        return email.contains("@") && email.indexOf("@") < email.lastIndexOf(".");
    }

	@Override
	public String toString() {
		return "Dueno [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email=" + email
				+ ", cedula=" + cedula + "]";
	}
    
}