import kotlin.collections.HashMap;

object WordCount {
	fun phrase(str: String):Map<String, Int> = str.toLowerCase()
				   .split(Regex("[^\\w'\"]+"))
				   .filter({it != ""})
				   .map({it.dropWhile({it=='\'' || it == '"'}).dropLastWhile({it=='\'' || it == '"'})})
		   		   .fold<String, Map<String, Int>>(HashMap())  {map, item ->
		   		   		map.plus(Pair(item, map.getOrDefault(item, 0)+1))}

}