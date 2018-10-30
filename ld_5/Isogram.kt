object Isogram {
	fun isIsogram(str: String): Boolean=
			   str.toLowerCase()
				  .filter(){it.isLetter()}
				  .toSet().size == str.toLowerCase()
						  	          .filter(){it.isLetter()}
				  					  .length
		
				
}