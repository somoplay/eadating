package com.somoplay.somoplay.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "identity_dating")
@NamedQueries({
	@NamedQuery(name="IdentityDating.findByKeyword", query="select s from IdentityDating s where s.name_en like :content"),
	@NamedQuery(name="IdentityDating.findByType", query="select s from IdentityDating s where s.type_main = :content"),
	@NamedQuery(name="IdentityDating.findByAverage", query="select s from IdentityDating s where s.average_price >= :content - 10 and s.average_price <= :content +10"),
	@NamedQuery(name="IdentityDating.findByDistance", query="select s from IdentityDating s where s.longitude >= :content - 20 and s.longitude <= :content + 20")
})

public class IdentityDating implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8350766794118687952L;//yao?
	
	private Long id;
	private Integer user_id;
	private Integer deleted;
	private Date created;
	
	private String display_name;
	private String signature;
	private Integer location;
	private BigDecimal latitude;
	private BigDecimal longitude;
		
	private Integer credit_points;
	private Integer date_purpose;
	private Integer zodiac;
	private Integer height;
	private Integer weight;
	private Integer body_type;
	private Integer ethnicity;
	private Integer education;
	private Integer profession;
	private Integer relationship_history;
	private Integer children;
	private Integer religion;
	private Integer smokes;
	private Integer drinks;
	
	private String introduction;
	private String perfect_match;
	private String ideal_date;
	private Set<Images> images;
	
	@Column(name = "id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "user_id")
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
	@Column(name = "deleted")
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	
	@Column(name = "created")
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	@Column(name = "display_name")
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	
	@Column(name = "signature")
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	@Column(name = "location")
	public Integer getLocation() {
		return location;
	}
	public void setLocation(Integer location) {
		this.location = location;
	}
	
	@Column(name = "latitude")
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	
	@Column(name = "longitude")
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	
	@Column(name = "credit_points")
	public Integer getCredit_points() {
		return credit_points;
	}
	public void setCredit_points(Integer credit_points) {
		this.credit_points = credit_points;
	}
	
	@Column(name = "date_purpose")
	public Integer getDate_purpose() {
		return date_purpose;
	}
	public void setDate_purpose(Integer date_purpose) {
		this.date_purpose = date_purpose;
	}
	
	@Column(name = "zodiac")
	public Integer getZodiac() {
		return zodiac;
	}
	public void setZodiac(Integer zodiac) {
		this.zodiac = zodiac;
	}
	
	@Column(name = "height")
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	@Column(name = "weight")
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	@Column(name = "body_type")
	public Integer getBody_type() {
		return body_type;
	}
	public void setBody_type(Integer body_type) {
		this.body_type = body_type;
	}
	
	@Column(name = "ethnicity")
	public Integer getEthnicity() {
		return ethnicity;
	}
	public void setEthnicity(Integer ethnicity) {
		this.ethnicity = ethnicity;
	}
	
	@Column(name = "latitude")
	public Integer getEducation() {
		return education;
	}
	public void setEducation(Integer education) {
		this.education = education;
	}
	
	@Column(name = "profession")
	public Integer getProfession() {
		return profession;
	}
	public void setProfession(Integer profession) {
		this.profession = profession;
	}
	
	@Column(name = "relationship_history")
	public Integer getRelationship_history() {
		return relationship_history;
	}
	public void setRelationship_history(Integer relationship_history) {
		this.relationship_history = relationship_history;
	}
	
	@Column(name = "children")
	public Integer getChildren() {
		return children;
	}
	public void setChildren(Integer children) {
		this.children = children;
	}
	
	@Column(name = "religion")
	public Integer getReligion() {
		return religion;
	}
	public void setReligion(Integer religion) {
		this.religion = religion;
	}
	
	@Column(name = "smokes")
	public Integer getSmokes() {
		return smokes;
	}
	public void setSmokes(Integer smokes) {
		this.smokes = smokes;
	}
	
	@Column(name = "drinks")
	public Integer getDrinks() {
		return drinks;
	}
	public void setDrinks(Integer drinks) {
		this.drinks = drinks;
	}
	
	@Column(name = "introduction")
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	@Column(name = "perfect_match")
	public String getPerfect_match() {
		return perfect_match;
	}
	public void setPerfect_match(String perfect_match) {
		this.perfect_match = perfect_match;
	}
	
	@Column(name = "ideal_date")
	public String getIdeal_date() {
		return ideal_date;
	}
	public void setIdeal_date(String ideal_date) {
		this.ideal_date = ideal_date;
	}
	
	@Column(name = "images")
	public Set<Images> getImages() {
		return images;
	}
	public void setImages(Set<Images> images) {
		this.images = images;
	}
}

