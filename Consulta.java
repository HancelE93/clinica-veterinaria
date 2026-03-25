public class Consulta {
	private String fecha;
	private String motivo;
	private String diagnostico;
	private double costo;
	private boolean requiereCirugia;
	
	public Consulta(String fecha, String motivo, String diagnostico, double costo, boolean requiereCirugia) {
		super();
		this.fecha = fecha;
		this.motivo = motivo;
		this.diagnostico = diagnostico;
		this.costo = costo;
		this.requiereCirugia = requiereCirugia;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		if(fecha=="" || fecha == null) {
			this.fecha = "01/01/2000";
		}
		this.fecha = fecha;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		if(motivo=="" || motivo == null) {
			this.motivo = "Sin Motivo Registrado";
		}
		this.motivo = motivo;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		if(diagnostico=="" || diagnostico == null) {
			this.diagnostico = "Pendiente de Diagnostico!";
		}
		this.diagnostico = diagnostico;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		if(costo<=0) {
			this.costo = 0.0;
		}
		this.costo = costo;
	}

	public boolean isRequiereCirugia() {
		return requiereCirugia;
	}

	public void setRequiereCirugia(boolean requiereCirugia) {
		this.requiereCirugia = requiereCirugia;
	}

	@Override
	public String toString() {
		return "Consulta [fecha=" + fecha + ", motivo=" + motivo + ", diagnostico=" + diagnostico + ", costo=" + costo
				+ ", requiereCirugia=" + requiereCirugia + "]";
	}
	
	public String calcularCategoriaCosto() {
		if(costo >50) {
			return "Bajo";
		}else if(costo >150) {
			return "Medio";
		}else {
			return "Alto";
		}
	}
	public boolean esCritica() {
		if(requiereCirugia & costo > 200) {
			return true;
		}else {
			return false;
		}
	}
}public class Consulta {
	private String fecha;
	private String motivo;
	private String diagnostico;
	private double costo;
	private boolean requiereCirugia;
	
	public Consulta(String fecha, String motivo, String diagnostico, double costo, boolean requiereCirugia) {
		super();
		this.fecha = fecha;
		this.motivo = motivo;
		this.diagnostico = diagnostico;
		this.costo = costo;
		this.requiereCirugia = requiereCirugia;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		if(fecha=="" || fecha == null) {
			this.fecha = "01/01/2000";
		}
		this.fecha = fecha;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		if(motivo=="" || motivo == null) {
			this.motivo = "Sin Motivo Registrado";
		}
		this.motivo = motivo;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		if(diagnostico=="" || diagnostico == null) {
			this.diagnostico = "Pendiente de Diagnostico!";
		}
		this.diagnostico = diagnostico;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		if(costo<=0) {
			this.costo = 0.0;
		}
		this.costo = costo;
	}

	public boolean isRequiereCirugia() {
		return requiereCirugia;
	}

	public void setRequiereCirugia(boolean requiereCirugia) {
		this.requiereCirugia = requiereCirugia;
	}

	@Override
	public String toString() {
		return "Consulta [fecha=" + fecha + ", motivo=" + motivo + ", diagnostico=" + diagnostico + ", costo=" + costo
				+ ", requiereCirugia=" + requiereCirugia + "]";
	}
	
	public String calcularCategoriaCosto() {
		if(costo >50) {
			return "Bajo";
		}else if(costo >150) {
			return "Medio";
		}else {
			return "Alto";
		}
	}
	public boolean esCritica() {
		if(requiereCirugia & costo > 200) {
			return true;
		}else {
			return false;
		}
	}
}