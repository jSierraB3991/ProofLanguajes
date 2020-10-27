demoVariables(){
    int n = 3;
    double x = 0.5;
    String s = "hola";
    bool b = false;
    String s2 = 'hola2';
    String comillaSimple = "''";
    String comillaDoble = '""';
    print(n);
    print(x);
    print(s);
    print(b);
    print(s2);
    print(comillaSimple);
    print(comillaDoble);

    var a = 7;
    print(a);

    //dynamic es cualquier cosa
    dynamic c;
    c = 'asd';
    print(c);
    c = 1234567;
    print(c);

    // num es generico para los datos numericos
    num y = 7;
    print(x);
    y = 7.5;
    print(x);
}

conversionString()
{
  int a = 5;
  double b = 3.141516;
  String sa = a.toString();
  String sb = b.toString();
  print(sa);
  print(sb);

  // Inversa
  String sc = "954";
  String sd = "2.78";
  int c = int.parse(sc);
  double d = double.parse(sd);
  print("Tengo $c euros");
  print("con ${c + d} euros");
}

stringLargos() {
  String large = 'En algún logar da la mancha '
                  'De cuyo nombre no quiero acordarme';
  print(large);
  String large2 = '''
En algún logar da la mancha
De cuyo nombre no quiero acordarme''';

  print(large2);

  if(!large2.isEmpty){
    print("large2 no esta vacio");
  }
}

listas()
{
  List<int> primos = [ 2, 3, 5, 7, 11, 13 ];
  List<dynamic> cosas = [2 ,true, 'hola', [], null];
  var nums = [1,2,4];
  nums.add(4);
  print(primos);
  print(cosas);
  print(nums);
  print(nums.length);
  print(nums[0]);

  bool large = false;
  var l = [
    1,2,3,
    if(large) 4,
    5
  ];
  print(l);

  int max = 10;
  var m = [
    -1,
    for(int i = 1; i <= max; i++) i,
    -1
  ];
  print(m);
}

sets(){
  Set<int> primos = { 2,2,3,5,7,11,13 };
  print(primos);
  if(primos.contains(13)) {
    print("13 es un primo");
  }
  Set<dynamic> cosas = { 1, "hola", true, null, []};
  var numeros = { 1, 2, 3, 4 };//Esto es un Map
  var nums = <String>{}; // Esto es un Set
}

mapas()
{
  var m = {
    "name": "James",
    "lastName": "bonds",
    "age": 2
  };
  m["email"] = 'judas3991@gmail.com';
  print(m);

  Map<int, String> numeros = {
    1: 'uno',
    2: 'dos',
    3: 'tres'
  };
  print(numeros[4]);
  numeros[5] = 'cinco';
  print(numeros);
}

void main() {
  mapas();
}
