using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Kugel : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {
        var Geschwindigkeit = 10f;
        var Richtung = new Vector3(0f, 0f, -1f);
        transform.position += Richtung * Geschwindigkeit * Time.deltaTime;
        print(transform.position.z);
        if(transform.position.z <= 0)
        {
            Destroy(gameObject);
            print("destroyed");
        }
    }
}