package com.acme

class Race {
	
	static constraints = {
		name(blank:false, maxSize:50) 
		startDate(validator: {return (it > new Date())})
		city(blank:false)
		state(blank:false) 
		distance(min:0.0)
		cost(min:0.0, max:100.0)
		maxRunners(min:0, max:100000)
	}
	
	String name
	Date startDate
	String city
	String state
	BigDecimal distance
	BigDecimal cost
	Integer maxRunners = 100000

	static mapping = { sort "startDate" }
}
