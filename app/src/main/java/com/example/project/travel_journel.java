package com.example.project;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class travel_journel extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    Button day1,day2,day3;
    TextView data;

    public travel_journel() {
        // Required empty public constructor
    }

    public static expense_manager newInstance(String param1, String param2) {
        expense_manager fragment = new expense_manager();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_travel_journel, container, false);

        day1 = (Button) rootView.findViewById(R.id.day1);
        day2 =  (Button) rootView.findViewById(R.id.day2);
        day3 = (Button) rootView.findViewById(R.id.day3);
        data =(TextView) rootView.findViewById(R.id.op);

        day1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText("Day 1 PLAN Morning: Gwalior Fort Gwalior Fort, also known as the 'pearl' of Indian hill forts, has a rich history dating back to 727 CE. The fortification spans across a 3 km long plateau overlooking Gwalior and is impossible to miss. It boasts an array of captivating palaces, temples, museums and other structures. It is a beautifully located fort with rich stone carved works and multiple museums and temples. The fort is associated with an interesting legend. According to the legend, a local king named Suraj Sen developed leprosy, a deadly disease that couldn’t be cured in those days. When the king had lost all hope, a sage named Gwalipa came to the king’s rescue and he miraculously cured the disease by asking the king to drink water from a sacred pond. When the king was cured, he decided to build a fort to honour the sage and also named the city after the sage, which came to be known as Gwalior. Afternoon: Sahastrabahu Temple The Sahastrabahu temple, constructed in 1093 at the Gwalior Fort, is a ruined twin Hindu temple with intricate carvings on its walls. The temple was originally three-storied and boasts of detailed carvings that are a sight to behold. The view from the temple is breathtaking and it's definitely worth spending some time here admiring the craftsmanship of the carvings. It's recommended as a must-visit destination after exploring the first fort. It is a beautiful architectural marvel in Gwalior near Gwalior Fort. This Temple belongs to Lord Vishnu the correct name of the Temple is Sahasra Bahu Temple meaning thousand hands of Lord Vishnu. The temple is very beautiful, calm, serene and peaceful you can spend quality time here. Evening: Jai Vilas Palace, Constructed in 1874, the Jai Vilas Palace is a grand edifice that incorporates various styles of European architecture. Its opulent and extravagant grand hall is one of its most notable features. The palace, which boasts an impressive size, is adorned with ornate decorations and intricate designs throughout its interior and exterior. It represents a stunning display of architectural mastery that has stood the test of time. ");
            }
        });

        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText("Day 2: Morning: The Sun Temple Gwalior is a Hindu temple dedicated to Surya Dev. It features elaborate carvings of horses, chariot wheels, and various deities on its red sandstone walls. Notably, it is the only temple that houses a statue of Surya Dev which is breathtakingly beautiful and exudes positive vibes. The architectural intricacies are stunning and well-maintained with ample parking space available without any entry ticket charges. It is the only temple that has the statue of Surya Dev, absolutely stunning! The sun god inside the temple is also absolutely breathtaking, we do get positive vibes by just looking at the lord Sun. Afternoon: Constructed in 1874, the Jai Vilas Palace is a grand edifice that incorporates various styles of European architecture. Its opulent and extravagant grand hall is one of its most notable features. The palace, which boasts an impressive size, is adorned with ornate decorations and intricate designs throughout its interior and exterior. It represents a stunning display of architectural mastery that has stood the test of time. Evening: Teli ka Mandir, a splendid Hindu temple in Gwalior, boasts intricate and magnificent architectural designs. Nonetheless, Teli ka Mandir remains one of the best temples in Gwalior due to its awe-inspiring architecture. The temple is a classic example of a design based on “musical harmonics” in architecture1. Despite the destruction of the temple’s tower and sanctum, its architecture and damaged carvings can still be appreciated from the ruins. The temple is the oldest part of the Gwalior Fort and stands out due to its height of 100 feet, making it the tallest and most stunning temple within the fort2. Despite the damage it has suffered over the centuries, Teli ka Mandir remains a significant example of ancient Indian architecture.");
            }
        });

        day3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText("Day 3: Morning: Madhav National Park is located in the Shivpuri district of Gwalior division in northwest Madhya Pradesh, India. The park is spread over an area of 375 square kilometres. Established in 1959, it is named after Madhav Rao Scindia, the erstwhile Maharaja of Gwalior. The park is an ecological haven extending over an area of 375 km2. The park is home to a variety of wildlife and is known for its monuments. The park’s terrain varies from wooded hills to flat grasslands and lakes. It is home to a variety of species including the chinkara, sambar, nilgai, chausingha, sloth bear, leopard, and a wide variety of birds. The park is also known for its historical monuments. The park also has a lake and a boat club. Afternoon: Gujari Mahal Archaeological Museum, also known as the State Archaeological Museum or Gwalior Fort Museum, is located within the fortress of Gujari Mahal in Gwalior, Madhya Pradesh, India. The museum displays various sculptures, statues, and other remains dating back to the 1st and 2nd centuries BCE. The Gujari Mahal was built in the 15th century by Raja Man Singh for his favourite wife, Mrignay");

            }
        });

        return rootView;
    }
}
