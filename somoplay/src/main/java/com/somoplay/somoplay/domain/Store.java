package com.somoplay.somoplay.domain;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "store")
@NamedQueries({
	@NamedQuery(name="Store.findByKeyword", query="select s from Store s where s.nameEn like :content"),
	@NamedQuery(name="Store.findByType", query="select s from Store s where s.typeMain = :content"),
	@NamedQuery(name="Store.findByAverage", query="select s from Store s where s.averagePrice >= :content - 10 and s.averagePrice <= :content +10"),
	@NamedQuery(name="Store.findByDistance", query="select s from Store s where s.longitude >= :content - 20 and s.longitude <= :content + 20")
})

public class Store implements Serializable {
	
	private static final long serialVersionUID = -4756711680529310853L;
	
	private Long id;
	private Integer active;
	private Integer priority;
	
	private String nameEn;
	// Chinese simple
	private String nameChS;
	private String nameChT;
	
	private Integer typeMain;
	private Integer typeSub;
	
	private BigDecimal lantitude;
	private BigDecimal longitude;
	private BigDecimal averagePrice;
	
	private Integer orderService;
	private Integer haveInternet;
	private Integer takeOut;
	private Integer delivery;
	private Integer drink;
	private Integer roomOrder;
	private Integer outsidePlace;
	
	private String address;
	private String city;
	private String province;
	private String country;
	private String postcode;
	private String crossingAddress;
	private String chineseAddress;
	
	private String phoneMain;
	private String phoneCell;
	private String phoneBusiness;
	private String email;
	private String website;
	
	private String featureProduct;
	private String destriptionEn;
	private String destriptionCh;

	private Set<Images> images;
	private Set<StorHour> storehours;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "ACTIVE")
	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Column(name = "NAME_EN")
	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String name_en) {
		this.nameEn = name_en;
	}

	@Column(name = "NAME_CH_S")
	public String getNameChS() {
		return nameChS;
	}

	public void setNameChS(String nameChS) {
		this.nameChS = nameChS;
	}

	@Column(name = "NAME_CH_T")
	public String getNameChT() {
		return nameChT;
	}

	public void setNameChT(String nameChT) {
		this.nameChT = nameChT;
	}

	@Column(name = "TYPE_MAIN")
	public Integer getTypeMain() {
		return typeMain;
	}

	public void setTypeMain(Integer typeMain) {
		this.typeMain = typeMain;
	}

	@Column(name = "TYPE_SUB")
	public Integer getTypeSub() {
		return typeSub;
	}

	public void setTypeSub(Integer typeSub) {
		this.typeSub = typeSub;
	}

	@Column(name = "LANTITUDE")
	public BigDecimal getLantitude() {
		return lantitude;
	}

	public void setLantitude(BigDecimal lantitude) {
		this.lantitude = lantitude;
	}

	@Column(name = "LONGITUDE")
	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	@Column(name = "AVERAGE_PRICE")
	public BigDecimal getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(BigDecimal averagePrice) {
		this.averagePrice = averagePrice;
	}

	@Column(name = "ORDER_SERVICE")
	public Integer getOrderService() {
		return orderService;
	}

	public void setOrderService(Integer orderService) {
		this.orderService = orderService;
	}

	@Column(name = "HAVE_INTERNET")
	public Integer getHaveInternet() {
		return haveInternet;
	}

	public void setHaveInternet(Integer haveInternet) {
		this.haveInternet = haveInternet;
	}

	@Column(name = "TAKE_OUT")
	public Integer getTakeOut() {
		return takeOut;
	}

	public void setTakeOut(Integer takeOut) {
		this.takeOut = takeOut;
	}

	@Column(name = "DELIVERY")
	public Integer getDelivery() {
		return delivery;
	}

	public void setDelivery(Integer delivery) {
		this.delivery = delivery;
	}

	@Column(name = "DRINK")
	public Integer getDrink() {
		return drink;
	}

	public void setDrink(Integer drink) {
		this.drink = drink;
	}

	@Column(name = "ROOM_ORDER")
	public Integer getRoomOrder() {
		return roomOrder;
	}

	public void setRoomOrder(Integer roomOrder) {
		this.roomOrder = roomOrder;
	}

	@Column(name = "OUTSIDE_PLACE")
	public Integer getOutsidePlace() {
		return outsidePlace;
	}

	public void setOutsidePlace(Integer outsidePlace) {
		this.outsidePlace = outsidePlace;
	}

	@Column(name = "ADDRESS")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "CITY")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "PROVINCE")
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "COUNTRY")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "POSTCODE")
	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Column(name = "CROSSING_ADDRESS")
	public String getCrossingAddress() {
		return crossingAddress;
	}

	public void setCrossingAddress(String crossingAddress) {
		this.crossingAddress = crossingAddress;
	}

	@Column(name = "CHINESE_ADDRESS")
	public String getChineseAddress() {
		return chineseAddress;
	}

	public void setChineseAddress(String chineseAddress) {
		this.chineseAddress = chineseAddress;
	}

	@Column(name = "PHONE_MAIN")
	public String getPhoneMain() {
		return phoneMain;
	}

	public void setPhoneMain(String phoneMain) {
		this.phoneMain = phoneMain;
	}

	@Column(name = "PHONE_CELL")
	public String getPhoneCell() {
		return phoneCell;
	}

	public void setPhoneCell(String phoneCell) {
		this.phoneCell = phoneCell;
	}

	@Column(name = "PHONE_BUSINESS")
	public String getPhoneBusiness() {
		return phoneBusiness;
	}

	public void setPhoneBusiness(String phoneBusiness) {
		this.phoneBusiness = phoneBusiness;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "WEBSITE")
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Column(name = "FEATURE_PRODUCT")
	public String getFeatureProduct() {
		return featureProduct;
	}

	public void setFeatureProduct(String featureProduct) {
		this.featureProduct = featureProduct;
	}

	@Column(name = "DESTRIPTION_EN")
	public String getDestriptionEn() {
		return destriptionEn;
	}

	public void setDestriptionEn(String destriptionEn) {
		this.destriptionEn = destriptionEn;
	}

	@Column(name = "DESTRIPTION_CH")
	public String getDestriptionCh() {
		return destriptionCh;
	}

	public void setDestriptionCh(String destriptionCh) {
		this.destriptionCh = destriptionCh;
	}

	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	public Set<Images> getImages() {
		return images;
	}

	public void setImages(Set<Images> images) {
		this.images = images;
	}

	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="store_id")
	public Set<StorHour> getStorehours() {
		return storehours;
	}

	public void setStorehours(Set<StorHour> storehours) {
		this.storehours = storehours;
	}
	
	
	
	
}
