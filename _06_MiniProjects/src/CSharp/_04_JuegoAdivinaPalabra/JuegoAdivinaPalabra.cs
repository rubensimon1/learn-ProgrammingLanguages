using System;

class JuegoAdivinaPalabra
{
    static void Main()
    {
        string palabra = "CSHARP";
        char[] progreso = new string('_', palabra.Length).ToCharArray();
        int intentos = 6;

        while (intentos > 0 && Array.Exists(progreso, c => c == '_'))
        {
            Console.WriteLine("Palabra: " + new string(progreso));
            Console.Write("Letra: ");
            char letra = Char.ToUpper(Console.ReadLine()[0]);
            bool acierto = false;

            for (int i = 0; i < palabra.Length; i++)
            {
                if (palabra[i] == letra)
                {
                    progreso[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto)
            {
                intentos--;
                Console.WriteLine("Incorrecto. Intentos restantes: " + intentos);
            }
        }

        Console.WriteLine(Array.Exists(progreso, c => c == '_') ? "Perdiste. La palabra era: " + palabra : "¡Ganaste! Palabra: " + palabra);
    }
}
