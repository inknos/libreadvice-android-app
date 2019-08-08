package org.libreadvice.app;


import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class Trending extends Fragment {

    private String TAG = Trending.class.getSimpleName();
    private ListView lv;

    ArrayList<HashMap<String, String>> contactList;


    public Trending() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trending, container, false);

        contactList = new ArrayList<>();
        lv = (ListView) view.findViewById(R.id.list_item);
        new GetContacts().execute();

        return view;
    }


    private class GetContacts extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(getActivity(), "Json Data is downloading", Toast.LENGTH_LONG).show();
        }

        @Override
        protected Void doInBackground(Void... arg0) {
            HttpHandler sh = new HttpHandler();
            // Making a request to url and getting response
            String url = "http://api.androidhive.info/contacts/";
            String jsonStr = "";
            //String jsonStr = sh.makeServiceCall(url);

            jsonStr = "{\n" +
                    "    \"articles\": [\n" +
                    "        {\n" +
                    "            \"title\" : \"Firefox\",\n" +
                    "            \"subtitle\": \"Il miglior browser libero di sempre Il miglior browser libero di sempre Il miglior browser libero di sempre Il miglior browser libero di sempre\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/firefox\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"title\" : \"Privacy: perché volerla\",\n" +
                    "            \"subtitle\" : \"Il miglior browser libero di sempre La libertà basta volerla.” (Marguerite Yourcenar)\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/privacy-perche-volerla\"\n" +
                    "        }, {\n" +
                    "            \"title\" : \"Firefox\",\n" +
                    "            \"subtitle\": \"Il miglior browser libero di sempre Il miglior browser libero di sempre Il miglior browser libero di sempre\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/firefox\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"title\" : \"Privacy: perché volerla\",\n" +
                    "            \"subtitle\" : \"La libertà basta volerla.” (Marguerite Yourcenar)\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/privacy-perche-volerla\"\n" +
                    "        }, {\n" +
                    "            \"title\" : \"Firefox\",\n" +
                    "            \"subtitle\": \"Il miglior browser libero di sempre\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/firefox\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"title\" : \"Privacy: perché volerla\",\n" +
                    "            \"subtitle\" : \"La libertà basta volerla.” (Marguerite Yourcenar) Il miglior browser libero di sempre Il miglior browser libero di sempre Il miglior browser libero di sempre Il miglior browser libero di sempre\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/privacy-perche-volerla\"\n" +
                    "        }, {\n" +
                    "            \"title\" : \"Firefox\",\n" +
                    "            \"subtitle\": \"Il miglior browser libero di sempre\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/firefox\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"title\" : \"Privacy: perché volerla\",\n" +
                    "            \"subtitle\" : \"La libertà basta volerla.” (Marguerite Yourcenar)\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/privacy-perche-volerla\"\n" +
                    "        }, {\n" +
                    "            \"title\" : \"Firefox\",\n" +
                    "            \"subtitle\": \"Il miglior browser libero di sempre\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/firefox\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"title\" : \"Privacy: perché volerla\",\n" +
                    "            \"subtitle\" : \"La libertà basta volerla.” (Marguerite Yourcenar)\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/privacy-perche-volerla\"\n" +
                    "        }, {\n" +
                    "            \"title\" : \"Firefox\",\n" +
                    "            \"subtitle\": \"Il miglior browser libero di sempre\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/firefox\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"title\" : \"Privacy: perché volerla\",\n" +
                    "            \"subtitle\" : \"La libertà basta volerla.” (Marguerite Yourcenar)\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/privacy-perche-volerla\"\n" +
                    "        }, {\n" +
                    "            \"title\" : \"Firefox\",\n" +
                    "            \"subtitle\": \"Il miglior browser libero di sempre\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/firefox\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"title\" : \"Privacy: perché volerla\",\n" +
                    "            \"subtitle\" : \"La libertà basta volerla.” (Marguerite Yourcenar)\",\n" +
                    "            \"abstract\" : \"\",\n" +
                    "            \"article-url\" : \"https://libreadvice.org/privacy-perche-volerla\"\n" +
                    "        }\n" +
                    "    ]\n" +
                    "}";
            Log.e(TAG, "Response from url: " + jsonStr);
            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);
                    // Getting JSON Array node
                    JSONArray contacts = jsonObj.getJSONArray("articles");

                    // looping through All Contacts
                    for (int i = 0; i < contacts.length(); i++) {
                        JSONObject c = contacts.getJSONObject(i);
                        String title = c.getString("title");
                        String subtitle = c.getString("subtitle");
                        String abs = c.getString("abstract");
                        String article_url = c.getString("article-url");
                        //String id = c.getString("id");
                        //String name = c.getString("name");
                        //String email = c.getString("email");
                        //String address = c.getString("address");
                        //String gender = c.getString("gender");

                        // Phone node is JSON Object
                        //JSONObject phone = c.getJSONObject("phone");
                        //String mobile = phone.getString("mobile");
                        //String home = phone.getString("home");
                        //String office = phone.getString("office");

                        // tmp hash map for single contact
                        HashMap<String, String> contact = new HashMap<>();

                        // adding each child node to HashMap key => value
                        contact.put("title", title);
                        contact.put("subtitle", subtitle);
                        contact.put("abstract", abs);
                        contact.put("article-url", article_url);

                        // adding contact to contact list
                        contactList.add(contact);
                    }
                } catch (final JSONException e) {
                    Log.e(TAG, "Json parsing error: " + e.getMessage());
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getActivity().getApplicationContext(),
                                    "Json parsing error: " + e.getMessage(),
                                    Toast.LENGTH_LONG).show();
                        }
                    });

                }

            } else {
                Log.e(TAG, "Couldn't get json from server.");
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getActivity().getApplicationContext(),
                                "Couldn't get json from server. Check LogCat for possible errors!",
                                Toast.LENGTH_LONG).show();
                    }
                });
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            ListAdapter adapter = new SimpleAdapter(getActivity(), contactList,
                    R.layout.list_item, new String[]{"title", "subtitle"},
                    new int[]{R.id.title, R.id.subtitle});
            lv.setAdapter(adapter);
        }
    }
}
