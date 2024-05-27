import React from 'react';
import { useHistory } from 'react-router-dom';
import './order.css'; // You can create this file for styling if needed

function OrderPage({ foodItem }) {
  const history = useHistory();

  const moveToPaymentPage = () => {
    history.push('/payment');
  };

  return (
    <div className="order-page">
      <h2>Order Details</h2>
      <div>
        <h3>{foodItem.name}</h3>
        <p>Price: {foodItem.price}</p>
        <p>Description: {foodItem.description}</p>
        {/* Add form elements for user input like quantity, delivery address, etc. */}
        <button onClick={moveToPaymentPage}>Proceed to Payment</button>
      </div>
    </div>
  );
}

export default OrderPage;
