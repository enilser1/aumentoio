import React from 'react';
import './DatePlaceholder.scss'

const DatePlaceholder = ({dateString}) => {
  let leyend = '';
  if(dateString) {
    const date = new Date(dateString);
    const english = new Intl.DateTimeFormat('en', { month: 'long', day: '2-digit', year: 'numeric' });
    leyend = english.format(date);
  }

  return (
   <span className='date-placeholder'>{leyend}</span>
  );
};

export default DatePlaceholder;