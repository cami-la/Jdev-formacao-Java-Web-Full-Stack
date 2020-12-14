package site.camila.cursojava.classes;

public class Disciplina {
	//atributos
	private String disciplina1;
	private double nota1;
	private String disciplina2;
	private double nota2;
	private String disciplina3;
	private double nota3;
	private String disciplina4;
	private double nota4;
	
	//métodos especiais
	public String getDisciplina1() {
		return disciplina1;
	}
	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public String getDisciplina2() {
		return disciplina2;
	}
	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public String getDisciplina3() {
		return disciplina3;
	}
	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public String getDisciplina4() {
		return disciplina4;
	}
	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina1 == null) ? 0 : disciplina1.hashCode());
		result = prime * result + ((disciplina2 == null) ? 0 : disciplina2.hashCode());
		result = prime * result + ((disciplina3 == null) ? 0 : disciplina3.hashCode());
		result = prime * result + ((disciplina4 == null) ? 0 : disciplina4.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota4);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (disciplina1 == null) {
			if (other.disciplina1 != null)
				return false;
		} else if (!disciplina1.equals(other.disciplina1))
			return false;
		if (disciplina2 == null) {
			if (other.disciplina2 != null)
				return false;
		} else if (!disciplina2.equals(other.disciplina2))
			return false;
		if (disciplina3 == null) {
			if (other.disciplina3 != null)
				return false;
		} else if (!disciplina3.equals(other.disciplina3))
			return false;
		if (disciplina4 == null) {
			if (other.disciplina4 != null)
				return false;
		} else if (!disciplina4.equals(other.disciplina4))
			return false;
		if (Double.doubleToLongBits(nota1) != Double.doubleToLongBits(other.nota1))
			return false;
		if (Double.doubleToLongBits(nota2) != Double.doubleToLongBits(other.nota2))
			return false;
		if (Double.doubleToLongBits(nota3) != Double.doubleToLongBits(other.nota3))
			return false;
		if (Double.doubleToLongBits(nota4) != Double.doubleToLongBits(other.nota4))
			return false;
		return true;
	}
	
	public String toString() {
		return "Disciplina [disciplina1=" + disciplina1 + ", nota1=" + nota1 + ", disciplina2=" + disciplina2
				+ ", nota2=" + nota2 + ", disciplina3=" + disciplina3 + ", nota3=" + nota3 + ", disciplina4="
				+ disciplina4 + ", nota4=" + nota4 + "]";
	}
	
	
}
