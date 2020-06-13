fn variables_mutables()
{
    let mut a = 5;
    println!("Hola mundo {}", a);
    a = 20;
    println!("Hola mundo {}", a);
}

fn hola_mundo() 
{
    let a = 5;
    println!("Hola mundo {}", a);
}

fn main() {
    variables_mutables();
}

