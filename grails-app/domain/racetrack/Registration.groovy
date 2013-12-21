package racetrack

class Registration {
	String name
	Date dateOfBirth
	String gender
	String address
	String city
	String state
	String zipcode
	String email
	Date dateCreated //注意：这是一个特殊的名字
	Date lastUpdated

	static constraints = {
	}

	static mapping = { autoTimestamp false }
	def beforeInsert = {
		// your code goes here
	}
	def beforeUpdate = {
		// your code goes here
	}
	def beforeDelete = {
		// your code goes here
	}
	def onLoad = {
		// your code goes here
	}
}
