import React from 'react';
import "./Tag.scss";

const mappingTypeToColor = {
  'JAVASCRIPT': 'success',
  'CSS': 'info',
  'JAVA': 'warning',
  'GO': 'danger',
  'HASKELL': 'important',
  'OTHER': 'other',
};
const Tag = ({ children = '' }) => {
  const type = mappingTypeToColor[children] || mappingTypeToColor['OTHER'];
  if(children.length === 0) {
    return <></>
  }
  
  return <span className={`tag label ${type}`}>{children.toUpperCase()}</span>
}

export default Tag;