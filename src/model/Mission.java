package model;
// Generated Nov 8, 2016 8:51:25 AM by Hibernate Tools 3.5.0.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Mission generated by hbm2java
 */
public class Mission implements java.io.Serializable {

	private BigDecimal missionId;
	private String nom;
	private BigDecimal periode;
	private Set cras = new HashSet(0);

	public Mission() {
	}

	public Mission(BigDecimal missionId) {
		this.missionId = missionId;
	}

	public Mission(BigDecimal missionId, String nom, BigDecimal periode, Set cras) {
		this.missionId = missionId;
		this.nom = nom;
		this.periode = periode;
		this.cras = cras;
	}

	public BigDecimal getMissionId() {
		return this.missionId;
	}

	public void setMissionId(BigDecimal missionId) {
		this.missionId = missionId;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public BigDecimal getPeriode() {
		return this.periode;
	}

	public void setPeriode(BigDecimal periode) {
		this.periode = periode;
	}

	public Set getCras() {
		return this.cras;
	}

	public void setCras(Set cras) {
		this.cras = cras;
	}

}
