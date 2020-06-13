fn hola_mundo() 
{
    let a = 5;
    println!("Hola mundo {}", a);
}

fn variables_mutables()
{
    let mut a = 5;
    println!("Hola mundo {}", a);
    a = 20;
    println!("Hola mundo {}", a);
}

/*  Data Type
    bool
    char
    i8      : signed integer 8 bits
    i16     : signed integer 16 bits
    i32     : signed integer 32 bits
    i64     : signed integer 64 bits
    u8      : unsigned integer 8 bits
    u16     : unsigned integer 16 bits
    u32     : unsigned integer 32 bits
    u64     : unsigned integer 64 bits
    f32     : point floating 32 bits
    f64     : point floating 64 bits
*/

fn data_type(a:i8, b:i8)
{
    println!("Hola mundo {}", a + b);
}

fn data_type_dos()
{
    let a = 10;
    let b = &a;

    println!("{}, {}, {:p}, {:p}", a, b, b, &a);
}

fn main() {
    data_type_dos();
}
