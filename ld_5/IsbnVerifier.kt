class IsbnVerifier{
    fun isValid(id: String): Boolean =
        id.toLowerCase()
          .filter {it != '-'}
          //if id is correct, fold return 0
          //at 10th symbol check whether id is correct
          //if id tamplate is correct, but verification is failed, return acc % 11 (which != 0)
          //if id contains > 10 symbols, return -1
          //if id has wrong symbols, return -1
          //if id has no symbols, return 1
          .foldIndexed(1) {index, acc, ch -> if (index>9) -1
              								  else if (acc<0) acc
              								  else if (index<9){
                                                    if (ch.isDigit())
                                              			acc+(10-index)*(ch.toInt() - '0'.toInt())
                                                    else -1;
                                              }else if (index==9){
                                                  if (ch.isDigit())
                                                        (acc+(10-index)*(ch.toInt() - '0'.toInt()) -1) % 11
                                                  else if (ch.isLetter() && ch=='x')
                                                  		(acc+10-1) % 11
                                                  else -1;
                                              }
                                              else -1} == 0
}
