public String stringSplosion(String str) {
  String new_str = "";
  String tmp = "";
  for (char letter: str.toCharArray()){
    tmp += letter;
    new_str += tmp;
  }
  return new_str;
}
