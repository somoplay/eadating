package com.somoplay.somoplay.domain;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "identity_dating")
@NamedQueries({
		@NamedQuery(name = "IdentityDating.findByKeyword", query = "select s from IdentityDating s where s.introduction like :content"),
		@NamedQuery(name = "IdentityDating.findByType", query = "select s from IdentityDating s where s.datePurpose = :content"),
		@NamedQuery(name = "IdentityDating.findByDistance", query = "select s from IdentityDating s where s.longitude >= :content - 20 and s.longitude <= :content + 20") })
public class IdentityDating implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8350766794118687952L;// yao?

	private Long id;
	private Integer userId;
	private Integer deleted;
	private Date created;

	private String displayName;
	private String signature;
	private Integer location;
	private BigDecimal latitude;
	private BigDecimal longitude;

	private Integer creditPoints;
	private Integer datePurpose;
	private Integer zodiac;
	private Integer height;
	private Integer weight;
	private Integer bodyType;
	private Integer ethnicity;
	private Integer education;
	private Integer profession;
	private Integer relationshipHistory;
	private Integer children;
	private Integer religion;
	private Integer smokes;
	private Integer drinks;

	private String introduction;
	private String perfectMatch;
	private String idealDate;
	private Set<Images> images;
	//private Set<User> user;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	// (strategy=GenerationType.AUTO)//auto increased main key
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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
	public Integer getCreditPoints() {
		return creditPoints;
	}

	public void setCreditPoints(Integer creditPoints) {
		this.creditPoints = creditPoints;
	}

	@Column(name = "date_purpose")
	public Integer getDatePurpose() {
		return datePurpose;
	}

	public void setDatePurpose(Integer datePurpose) {
		this.datePurpose = datePurpose;
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
	public Integer getBodyType() {
		return bodyType;
	}

	public void setBodyType(Integer bodyType) {
		this.bodyType = bodyType;
	}

	@Column(name = "ethnicity")
	public Integer getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(Integer ethnicity) {
		this.ethnicity = ethnicity;
	}

	@Column(name = "education")
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
	public Integer getRelationshipHistory() {
		return relationshipHistory;
	}

	public void setRelationshipHistory(Integer relationshipHistory) {
		this.relationshipHistory = relationshipHistory;
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
	public String getPerfectMatch() {
		return perfectMatch;
	}

	public void setPerfectMatch(String perfectMatch) {
		this.perfectMatch = perfectMatch;
	}

	@Column(name = "ideal_date")
	public String getIdealDate() {
		return idealDate;
	}

	public void setIdealDate(String idealDate) {
		this.idealDate = idealDate;
	}

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "ELEMENT_ID")
	public Set<Images> getImages() {
		return images;
	}

	public void setImages(Set<Images> images) {
		this.images = images;
	}
/*
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "ELEMENT_ID")
	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}
*/
}
