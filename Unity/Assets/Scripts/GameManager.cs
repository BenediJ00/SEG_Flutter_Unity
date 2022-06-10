using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class GameManager : MonoBehaviour
{
    public GameObject hindernissPrefab;
    List<Vector3> spawnPositionen = new List<Vector3>(9);

    // Start is called before the first frame update
    void Start()
    {
        for (int i = 1; i < 4; i++)
        {
            for (int n = 1; n < 4; n++)
            {
                spawnPositionen.Add(new Vector3(n*3, i*3, 50));
            }
            
        }
    }

    // Update is called once per frame
    void Update()
    {
        for (int i = 0; i < 9; i++)
        {
            int zahlenInput = i + 1;

            if (Input.GetKeyDown(""+zahlenInput))
            {
                Instantiate(hindernissPrefab, spawnPositionen[i], hindernissPrefab.transform.rotation);
            }
        }
    }
}
