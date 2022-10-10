package com.example.rekrutacja;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rekrutacja.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

   /*3. TODO Poniżej znajduje się kod, który obsługuje kliknięcia dwóch przycisków,
                jednak na wyświetlającym się widoku nie są one podpisane. Twoim
                zadaniem jest wywnioskowanie co kliknięcie na poszczególny przycisk zmienia
                i adekwatne podpisanie tych przycisków w pliku activity_second.xml.
                Kolejne zadanie znajduje się poniżej.

                Podpisanie - chodzi o android:text.
         */

        binding.firstButton.setOnClickListener(v -> {
            if(isVisible())
                binding.image.setVisibility(View.GONE);
             else
                Toast.makeText(SecondActivity.this, "Obrazek jest niewidoczny", Toast.LENGTH_SHORT).show();
        });

        binding.secondButton.setOnClickListener(v -> {
            if(isVisible())
                Toast.makeText(SecondActivity.this, "Obrazek jest już widoczny", Toast.LENGTH_SHORT).show();
            else
                binding.image.setVisibility(View.VISIBLE);
        });

        binding.bothButton.setOnClickListener(v -> showOrHideButton());

        binding.backToMainActivityButton.setOnClickListener(v -> finish());

        /*4. TODO W tym activity znajduje się jeszcze jeden przycisk niestety kliknięcie
                na niego nic nie robi. Twoim zadaniem jest implementacja kliknięcia w taki sposób,
                aby jak obrazek jest widoczy przycisk chował obrazek, w przeciwnym wypadku,
                gdy obrazek jest schowany po kliknięciu obrazek ma się pojawić. Dodatkowo należy
                przerobić listenery poprzednich obrazków tak, aby np. Klikając na przycisk do chowania
                obrazka, chował on obrazek, a w przypadku kliknięcia, gdy obrazek jest niewidoczny
                wyświetlał informację o tym, obrazek jest już niewidoczny (np. za pomocą Toast lub
                SnackBar lub AlertDialog). Podobnie dla drugiego przycisku odpowiedzialnego za
                wyświetlanie obrazka. Jednocześnie zmień widok tego przycisku tak, aby nie wszystkie
                litery, były pisane wielką literą.
                Kolejne zadanie znajduje się poniżej.
         */

        /*5. TODO Ostatnie zadanie polega na dodaniu przycisku pozwalającego na przejście spowrotem
                do MainActivity. Tutaj jednak nie chcemy, abyś otwierał nowe activity, tylko po
                kliknięcku przycisku zamknął aktualne, ponieważ pod aktualnie wyświetlanym activity
                jest już instancja MainActivity.

         */

        /* TODO Zadanie Dodatkowe. Tutaj masz zupełną dowolność, jeśli masz jeszcze czas
                i ochotę zrób coś kreatywnego, ale jednocześnie prostego,
                pamiętaj jednak, aby nie naruszyć tym kodu,
                który realizuje poprzednich zadań. Nie jest to zadanie obowiązkowe.
         */
    }

    private boolean isVisible() {
        return binding.image.getVisibility() == View.VISIBLE;
    }

    private void showOrHideButton() {
        if(isVisible())
            binding.image.setVisibility(View.GONE);
        else
            binding.image.setVisibility(View.VISIBLE);
    }
}