int max3(int a, int b, int c)
{
  var r = a;
  if(b > r) r = b;
  if(c > r) r = c;
  return c;
}

f(){
  print("no hago nada");
}

String transformA(String s, bool mayus, int exclam)
{
  if(mayus) s =s.toUpperCase();
  s = s + '!'*exclam;
  return s;
}

String transformB(String s, [bool mayus = false, int exclam = 0])
{
  if(mayus) s =s.toUpperCase();
  s = s + '!'*exclam;
  return s;
}


String transformC(String s, {bool mayus = false, int exclam = 0})
{
  if(mayus) s =s.toUpperCase();
  s = s + '!'*exclam;
  return s;
}

parametro(){
  print(f());
  print(max3(3,6,8));
  print(transformA('hola', true, 5));
  print(transformA('hola2', false, 3));
  print(transformB('hola3', true));
  print(transformB('adios'));
  print(transformC('adios', exclam: 5));
}

showLista(List<dynamic> cosas){
  cosas.forEach(print);
}
showListaB(List<dynamic> cosas){
  cosas.forEach((elem) => {
    print("elemento -> $elem")
  });
}

void main()
{
  showLista([null, false, 3, "hola"]);
  showListaB([null, false, 3, "hola"]);
}
