using UnityEngine;
using System.Collections;

public class Dash : MonoBehaviour {

	public Vector3 moveDirection;
	public float MaxDashTime = 1.0f;
	public float dashSpeed = 1.0f;
	public float dashStoppingSpeed = 0.1f;

	private float currentDashTime;

	void Start()
	{
		currentDashTime = MaxDashTime;
	}

	void Update()
	{
		if (Input.GetKeyDown("space"))
		{
			currentDashTime = 0.0f;
		}
		if (currentDashTime < MaxDashTime)
		{
			moveDirection = new Vector3(0, 0, dashSpeed);
			currentDashTime += dashStoppingSpeed;
		}
		else
		{
			moveDirection = Vector3.zero;
		}
		transform.Translate(moveDirection*Time.deltaTime);
	}
}
